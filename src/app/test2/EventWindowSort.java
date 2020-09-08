package app.test2;

import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

class EventWindowSort {
  private final ConcurrentSkipListMap<ZonedDateTime, String> events = new ConcurrentSkipListMap<>(
      Comparator.comparingLong(value -> value.toInstant().toEpochMilli()));

  private final int TARGET_MINUTE = 1;

  void acceptEvent(Event event) {
    events.put(event.getEventTime(), event.getContent());
  }

  /**
   * 過去60秒間に発生した全てのイベントを取得するため、
   * tailMap()*メソッドを使用し、要素を取得する時刻を渡します。
   */
  ConcurrentNavigableMap<ZonedDateTime, String> getEventsFromLastMinute() {
    return events.tailMap(ZonedDateTime.now().minusMinutes(TARGET_MINUTE));
  }

  /**
   * 現在より60秒間に発生した全てのイベントを取得するため、
   * headMap()*メソッドを使用し、要素を取得する時刻を渡します。
   */
  ConcurrentNavigableMap<ZonedDateTime, String> getEventsOlderThatOneMinute() {
    return events.headMap(ZonedDateTime.now().minusMinutes(TARGET_MINUTE));
  }

}
