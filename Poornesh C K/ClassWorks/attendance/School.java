class School{
	String sname;
	int sid;
	School(){
		
			
	}
	public void setsName(String name){
		sname=name;
	}
	public String getsname(){
		return sname;
	}
	public void setsId(int id){
		sid=id;
	}
	public int getsId(){
		return sid;
	}
	public String toString(){
		return sname + " ["+sid+"]";		

}	
}