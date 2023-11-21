package e7;

import java.io.File;

public class Exercise7_2_Tests {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("java WordCount [input dir path] [source name] [output file path]");
			System.exit(-1);
		}
		String inputDirPath = args[0];
		String sourceName = args[1];
		String outputFilePath = args[2];

		WordCount.setSourceWordCountMap(inputDirPath);
		WordCount wc = WordCount.getWordCountObj(sourceName);
		File outputFile = new File(outputFilePath);
		wc.writeTopNFrequentWords(5, outputFile);
	}
	
}
