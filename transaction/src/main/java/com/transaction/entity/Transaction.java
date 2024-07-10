package com.transaction.entity;

public class Transaction {
	
private SenderEntity sender;
private ReceiverEntity receiver;


public SenderEntity getSender() {
	return sender;
}
public void setSender(SenderEntity sender) {
	this.sender = sender;
}
public ReceiverEntity getReceiver() {
	return receiver;
}
public void setReceiver(ReceiverEntity receiver) {
	this.receiver = receiver;
}
}
