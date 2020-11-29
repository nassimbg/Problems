import common.Utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {

  public static int leastInterval(char[] tasks, int n) {
    final PriorityQueue<NodeInfo> indexZeroQueue = initializeTasksInPQIndexZero(tasks);

    Map<Integer, PriorityQueue<NodeInfo>> queuesPerIndex = new HashMap<>();
    queuesPerIndex.put(0, indexZeroQueue);

    PriorityQueue<QueueInfo> pqPerIndex = new PriorityQueue<>(Comparator.<QueueInfo>comparingInt(v -> v.nodeInfo.count).reversed());
    int count = 0;
    while (!pqPerIndex.isEmpty() || !queuesPerIndex.isEmpty()) {
      final PriorityQueue<NodeInfo> currentIndexQueue = queuesPerIndex.get(count);
      if (currentIndexQueue != null) {
        final QueueInfo queueInfo = new QueueInfo(count);
        queueInfo.nodeInfo = currentIndexQueue.poll();
        pqPerIndex.add(queueInfo);

        if (currentIndexQueue.isEmpty()) {
          queuesPerIndex.remove(count);
        }
      }

      if (!pqPerIndex.isEmpty()) {
        final QueueInfo polledQueueInfo = pqPerIndex.poll();
        final NodeInfo currentNodeInfo = polledQueueInfo.nodeInfo;
        currentNodeInfo.count--;
        if (currentNodeInfo.count > 0) {
          final PriorityQueue<NodeInfo> nextQueue = queuesPerIndex.computeIfAbsent(count + n + 1, k -> createLevelQueue());
          nextQueue.add(currentNodeInfo);
        }

        final PriorityQueue<NodeInfo> nodeInfosOfPolledIndex = queuesPerIndex.get(polledQueueInfo.timeIndex);
        if (nodeInfosOfPolledIndex != null) {
          polledQueueInfo.nodeInfo = nodeInfosOfPolledIndex.poll();

          if (nodeInfosOfPolledIndex.isEmpty()) {
            queuesPerIndex.remove(polledQueueInfo.timeIndex);
          }
          pqPerIndex.add(polledQueueInfo);
        }

      }
      count++;
    }

    return count;
  }

  private static PriorityQueue<NodeInfo> initializeTasksInPQIndexZero(final char[] tasks) {
    PriorityQueue<NodeInfo> pq = createLevelQueue();

    NodeInfo[] nodeInfoPerTaskName = createTasksInfo(tasks);

    for (final NodeInfo nodeInfo : nodeInfoPerTaskName) {
      if (nodeInfo != null) {
        pq.add(nodeInfo);
      }
    }

    return pq;
  }

  private static PriorityQueue<NodeInfo> createLevelQueue() {
    return new PriorityQueue<>(Comparator.<NodeInfo>comparingInt(v -> v.count).reversed());
  }

  private static NodeInfo[] createTasksInfo(final char[] tasks) {
    NodeInfo[] nodeInfoPerTaskName = new NodeInfo[26];

    for (final char task : tasks) {
      final int index = Utils.upperCaseCharToInt(task);

      if (nodeInfoPerTaskName[index] == null) {
        nodeInfoPerTaskName[index] = new NodeInfo(task);
      }

      nodeInfoPerTaskName[index].count++;
    }
    return nodeInfoPerTaskName;
  }


  private static class NodeInfo {
    private final char task;
    private int count;

    private NodeInfo(final char task) {
      this.task = task;
    }

    @Override
    public String toString() {
      return "NodeInfo{" +
          "task=" + task +
          ", count=" + count +
          '}';
    }
  }

  private static class QueueInfo {
    private final int timeIndex;
    private NodeInfo nodeInfo;

    private QueueInfo(final int timeIndex) {
      this.timeIndex = timeIndex;
    }

    @Override
    public String toString() {
      return "QueueInfo{" +
          "timeIndex=" + timeIndex +
          ", nodeInfo=" + nodeInfo +
          '}';
    }
  }
}
