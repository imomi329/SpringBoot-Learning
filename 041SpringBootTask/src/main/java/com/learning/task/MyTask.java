package com.learning.task;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**  

MyTask.tast1()
MyTask.tast1()
MyTask.tast2()
MyTask.tast1()
MyTask.tast1()
------------------------------
task1：每 10 秒打印 1 次
task2：每 1 分鐘打印 1 次
------------------------------
一分鐘是 60 秒 ＝ 每打印 6 次task1之後，才能夠打印 1 次task2
------------------------------
spring task 在計算時間的時候，是根據當前服務器的系統時間進行計算.
如果是每 10 秒執行一次的話，那麼它是從系統時間的 0, 10, 20 秒進行計算的.
如果是每 1 分鐘執行一次的話，那麼它是從系統時間的 1分鐘. 2分鐘 進行計算的.

如果是這樣的話，那麼會碰到這樣的情況，就是當我們剛啟動程序的時候，我們的時間

剛好是17:04:48 秒



 * @date	2017-10-31 2:03:29 PM
 * @author	yuan 
 * @version	
 */
@Configuration
@EnableScheduling
public class MyTask {
	
	/*
	 * 我們希望這個方法每 10 秒打印一次.
	 * cron 定時任務表達式.
	 * 
	 * 指定：秒，分鐘，小時，日期，月份，星期，年(可選).
	 * ＊：任意
	 */
	@Scheduled(cron="0/10 * * * * *")
	public void tast1() {
		System.out.println("MyTask.tast1(), " + new Date());
	}
	
	/*
	 * 我們希望這個方法每 1 分鐘打印一次.
	 */
	@Scheduled(cron="0 0/1 * * * *")
	public void tast2() {
		System.out.println("MyTask.tast2(), " + new Date());
	}
	
	/*
	 * Sample of CRON
	 * "0 0 12 * * ?"	---每天中午12點觸發
	 * "0 15 10 ? * *"	---每天早上10：15觸發
	 * "0 15 10 * * ?"	---每天早上10：15觸發
	 * "0 15 10 * * ? *"---每天早上10：15觸發
	 * "0 15 10 * * ? 2005" ---2005年的每天早上10：15觸發
	 * "0 * 14 * * ?"	---每天從下午2點開始到2點59分，每分鐘觸發一次
	 * "0 0/5 14 * * ?" ---每天從下午2點開始到2點55分，每5分鐘觸發一次
	 * "0 0/5 14,18 * * ?"	---每天從下午2點開始到2點55分 && 下午6點開始到6點55分 兩個時段，每5分鐘觸發一次
	 * "0 0-5 14 * * ?" ---每天14：00至14：05 ，每分鐘觸發一次
	 * "0 10,44 14 ? 3 WED" ---三月的每週三的14：10 和 14：44 觸發
	 * "0 15 10? * MON-FRI" ---每週一到五的10：15觸發
	 */

}
  