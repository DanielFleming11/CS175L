
public class RoachPopulation {


		private double population;
	
		public RoachPopulation(double numRoaches) {
			population = numRoaches;
		}
		
		public void spray(double pesticide) {
			
			population = population * (pesticide / 100);
		}
		public void breed() {
			
			population = population * 2;
	}
		public int getRoaches() {
			return ((int) population); 

}
}
