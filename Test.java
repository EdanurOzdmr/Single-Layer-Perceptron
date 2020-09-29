package singlelayerperceptron;

public class Test {
	public static void main(String[] args) {
		
		AppleAndOrange ao= new AppleAndOrange();
		
		double inputs [][]= {{1,0},{0,1}};
		int outputs []= {1,0};
		
		ao.Train(inputs, outputs, -1, 0.5, 20);
		ao.Output(new double[] {1,0});
		ao.Output(new double[] {0,1});
		
		
	}

}
