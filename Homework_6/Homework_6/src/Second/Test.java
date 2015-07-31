package Second;

public class Test {

	public static void main(String[] args) {
		Cat[] cats = new Cat[10];
		String[] names = {"Ivan","Dragan","Petkan", "Ivo","Pesho","Gosho","Tosho", "Puhcho", "Topcho", "Bezimenen"};
		int[] years = {1,2,3,4,5,6,7,8,9,1};
        for(int i=0; i<cats.length; i++){
           cats[i] = new Cat(names[i], years[i]);
           cats[i].Say();
           
        }

	}

}
