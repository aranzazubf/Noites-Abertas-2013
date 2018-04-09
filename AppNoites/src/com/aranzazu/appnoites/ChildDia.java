package com.aranzazu.appnoites;



	public class ChildDia {
		
		private String text;
		
	
		
		private final String text2;
		
		private int Image;
		private int Image2;
		
		public ChildDia(String text,String text2, int Image, int Image2){
		
		this.text = text;
		
		
		
		this.text2 = text2;
		this.Image = Image;
		this.Image2 = Image2;
		}
	
		public void setText(String text) {
		
		this.text = text;
	
		}
		
		public String getText() {
	
		return text;
	
		}
		public void setImage(int image){
			this.Image=image;
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
	
		}

