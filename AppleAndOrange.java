package singlelayerperceptron;

public class AppleAndOrange {

	double[] weights = new double[2];
	double threshold;

	public void Train(double[][] inputs, int[] outputs, double threshold, double alpha, int itr) {

		this.threshold = threshold;
		int n = inputs[0].length;
		int p = outputs.length;
		weights[0] = 1;
		weights[1] = 2;

		for (int i = 0; i < itr; i++) {

			int totalError = 0;
			for (int j = 0; j < p; j++) {
				int output = Output(inputs[j]);
				int error = outputs[j] - output;
				totalError += error;
				if (error == 0) {
					for (int k = 0; k < n; k++) {
						System.out.print("w" + k + "=" + weights[k] + "\t");
					}
				} else if (error == -1) {

					if (outputs[j] > output) {
						for (int k = 0; k < n; k++) {
							weights[k] += alpha * inputs[j][k];
							System.out.print("w" + k + "=" + weights[k] + "\t");

						}

					} else if (outputs[j] < output) {
						for (int k = 0; k < n; k++) {
							weights[k] -= alpha * inputs[j][k];
							System.out.print("w" + k + "=" + weights[k] + "\t");
						}

					}

				}
				System.out.println("");
			}

			if (totalError == 0)
				break;
		}
	}

	public int Output(double[] input) {
		double sum = 0.0;
		for (int i = 0; i < input.length; i++) {
			sum += weights[i] * input[i];
		}

		if (sum > threshold) {
			return 1;

		} else {
			return 0;
		}
	}

}
