package ss4;

import java.time.LocalTime;


    public  class StopWatch {
        private LocalTime startTime, endTime;
        public StopWatch(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
        public int getElapsedTime(){
            int milliseconds = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
            return milliseconds;
        }
    }
