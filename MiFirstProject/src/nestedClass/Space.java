package nestedClass;

public class Space {
	private Planet[] planets;
	
	public Space() {
		
	}
	
	public static class Planet {
		private String name;
		private int size;
		
		public Planet() {
			this.name = "no name";
			this.size = 0;
		}
		
		public Planet(String name, int size){
			this.name = name;
			this.size = size;
		}
	}
}
