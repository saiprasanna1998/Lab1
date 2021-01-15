package com.cg.lab4;

public abstract class item {
	
	private int id;
	private String title;
	private int noOfCopies;
	public Item() {
	super();
	}
	public Item(int id,String title,int noOfCopies) {
	super();
	this.id=id;
	this.title=title;
	this.noOfCopies=noOfCopies;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getTitle() {
	return title;
	}
	public void setTitle(String title) {
	this.title = title;
	}
	public int getNoOfCopies() {
	return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
	}


	}
	class WrittenItems extends Item{
	private String author;

	public WrittenItems() {
	super(508,"Java",100);
	}
	public WrittenItems(String author) {
	super();
	this.author=author;
	}
	}
	 class Book extends WrittenItems{

	 }
	 
	 class Journalpaper extends WrittenItems{
	private int yearPublished;
	 }
	 
	 abstract class MediaItem extends Item{
	private int runtime;
	 }
	 
	 
	 class video extends MediaItem{
	private String director;
	private int year;
	 }
	 
	 
	 class CD extends MediaItem{
	private String artist;


}
