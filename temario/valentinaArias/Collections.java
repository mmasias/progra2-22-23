import java.util.*;
public  class Collections {
	public static void main(String[] args) {
		Collection<String> CarBranbdList = new ArrayList<String>();
		CarBranbdList.add("Audi");
		CarBranbdList.add("Audi");
		CarBranbdList.add("Audi");
		CarBranbdList.add("Audi");
		CarBranbdList.add("Audi");
		CarBranbdList.add("Audi");

		System.out.println("Numero de elementos antes de eliminar " + CarBranbdList.size());
		System.out.println(CarBranbdList.toString());

		CarBranbdList.remove("Seat");
		CarBranbdList.remove("Mercedes");

		System.out.println("Numero elemtos despues de elimnar seat y mercedes:" + CarBranbdList.size());
		System.out.println(CarBranbdList.toString());
		Iterator<String> it = CarBranbdList.iterator();
		for (int i = 0; it.hasNext(); i++) {
			String brand = it.next();
			if (brand.equals("Audi")) {
				it.remove();
			}
		}
	}
}
