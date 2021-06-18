import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;

import javax.swing.JPanel;

public class Diagramm {

    public static void main(String[] args) {
        //pie chart
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("Category A", 10);
        piedataset.setValue("Category B", 20);
        piedataset.setValue("Category C", 10);
        piedataset.setValue("Category D", 20);
        piedataset.setValue("Category E", 30);


        //add values to dataset
        JFreeChart chart = ChartFactory.createPieChart(
                "Category Summary" ,//title
                piedataset, //dataset
                true, //legend
                true, //tooltip
                false //use to generate URLs?
        );


        //generate the chart

        try{
            ChartUtilities.saveChartAsJPEG(
                    new File("E:/Practic/RESULT/finalPiechat.jpeg"),
                    chart,
                    500,
                    300
            );
        } catch(Exception e){
            System.err.println("Error" + e);
        }
    }

}
