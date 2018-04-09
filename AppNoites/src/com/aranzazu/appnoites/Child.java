package com.aranzazu.appnoites;



	public class Child {
		
		private String text;
		
		private int Image;
		
		private final String text2;
		
		private int Image2;
		
		private String text3;
		 
		
		public Child(String text, int Image, String text2, int Image2,String text3){
		
		this.text = text;
		
		this.Image = Image;
		
		this.text2 = text2;
		
		this.Image2=Image2;
		
		this.text3 = text3;
		}
	
		public void setText(String text) {
		
		this.text = text;
	
		}
		public void setImge(int image){
			this.Image=image;
		}
	
		public String getText() {
	
		return text;
	
		}
	
		 
	
		public int getImage() {
	
		return Image;
	
		}
		public int getImage2() {
			
			return Image2;
		
			}
		public String getText2() {

		return text2;
		
		}
		public String getText3() {

			return text3;
			
			}
	
		}


