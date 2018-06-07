package example_session6_2;

public class MainClass {

	public static void main(String[] args) {
		//vd về Aggregation (tổng hợp)
		Battery battery1 = new Battery("3000", "Li-ion");
		CellPhone cellPhone1 = new CellPhone("GalaxyS9", battery1);
		System.out.println(cellPhone1.toString());
	}

}
