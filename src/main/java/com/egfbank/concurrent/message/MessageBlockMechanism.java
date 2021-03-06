package com.egfbank.concurrent.message;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author tonny
 * 实现生产者，消费者获取到的锁是同一个锁
 */
public class MessageBlockMechanism {
	
	private   static  Lock lock = new ReentrantLock();
	private   static  Condition condition = lock.newCondition();
	
	private   static  boolean  produceConsumeFlag = true;
	
	
	 
	public   static Condition getLockCondition(){
		return  condition;
	}

	
	public static   Lock getLock(){
		return  lock;
	}
	
	
	public static boolean isProduceConsumeFlag() {
		return produceConsumeFlag;
	}

	public static void setProduceConsumeFlag(boolean produceConsumeFlag) {
		MessageBlockMechanism.produceConsumeFlag = produceConsumeFlag;
	}


}
