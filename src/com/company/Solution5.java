package com.company;

/**
 * Created by linetdsouza on 3/7/16.
 */
    import java.io.BufferedReader;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    public class Solution5 {

        public static void main(String[] args) {

            String csvFile = "/Users/linetdsouza/Downloads/RGC CI Programming Challenge/dig_binary_traits.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            try {

                br = new BufferedReader(new FileReader(csvFile));

                String header = br.readLine();
                String[] colsToString = header.split(cvsSplitBy);

                int [][]Array2DForAllPatients = new int[colsToString.length][colsToString.length];

                boolean rowHeader = false;
                while ((line = br.readLine()) != null) {
                    String[] record = line.split(cvsSplitBy);
                    int[] intrecord = new int[record.length];
                    for(int i=0; i <record.length; i++) {
                        if(record[i].isEmpty())
                            record[i] = "0";
                        intrecord[i]= Integer.parseInt(record[i]);
                    }

                    for (int i = 1 ; i < intrecord.length; i++)
                    {
                        for(int j = i + 1; j<intrecord.length;j++)
                        {
                            if ((intrecord[i] == intrecord[j]) && (intrecord[i]== 1))
                            {
                                Array2DForAllPatients[i][j] += 1;
                            }
                        }
                    }
                }

                for(int  i = 1; i < colsToString.length; i++)
                {
                    for(int j = i + 1 ; j < colsToString.length; j++)
                    {
                        System.out.println("  " + colsToString[i] + " " + colsToString[j] + " => " +
                                Array2DForAllPatients[i][j]);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Done");
        }
    }


