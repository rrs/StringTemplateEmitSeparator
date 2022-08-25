import org.stringtemplate.v4.*;

public class App {
    public static void main(String[] args) throws Exception {
        var values = new Object[] { null, Integer.valueOf(1), null, Integer.valueOf(3)};

        var templateString = """
<values; separator=",", null="">
""";
        var st = new ST(templateString);

        st.add("values", values);

        System.out.println(st.render());
    }
}
