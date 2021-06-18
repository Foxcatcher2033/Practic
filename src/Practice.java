import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Practice extends ApplicationFrame {

    public Practice(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Категория",
                "Очки",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        int width = 960;
        int height = 540;

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(width, height));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        Practice chart = new Practice("Семейство Джостаров",
                "Сравнение семейства Джостаров?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

    private CategoryDataset createDataset() {
        final String JoJo1 = "Джонатан Джостар";
        final String JoJo2 = "Джозеф Джостер";
        final String JoJo3 = "Джотаро Куджо";
        final String JoJo4 = "Джоске Хигашиката";
        final String charisma = "Харизма";
        final String strength = "Сила";
        final String popularity = "Популярность";
        final String height = "Рост / м";
        final String weight = "Вес / 1 * 10 кг";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.addValue(6.0, JoJo1, charisma);
        dataset.addValue(4.0, JoJo1, popularity);
        dataset.addValue(6.0, JoJo1, strength);
        dataset.addValue(1.95, JoJo1, height);
        dataset.addValue(10.5, JoJo1, weight);

        dataset.addValue(8.0, JoJo2, charisma);
        dataset.addValue(7.0, JoJo2, popularity);
        dataset.addValue(7.5, JoJo2, strength);
        dataset.addValue(1.95, JoJo2, height);
        dataset.addValue(9.7, JoJo2, weight);

        dataset.addValue(8.5, JoJo3, charisma);
        dataset.addValue(8.5, JoJo3, popularity);
        dataset.addValue(9.5, JoJo3, strength);
        dataset.addValue(1.95, JoJo3, height);
        dataset.addValue(8.2, JoJo3, weight);

        dataset.addValue(9.0, JoJo4, charisma);
        dataset.addValue(7.0, JoJo4, popularity);
        dataset.addValue(8.0, JoJo4, strength);
        dataset.addValue(1.85, JoJo4, height);
        dataset.addValue(8.2, JoJo4, weight);

        return dataset;
    }

}
