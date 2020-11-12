import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MathExpressions {

    public static double calculate(String expression) {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Object eval = null;
        try {
            eval = engine.eval(expression);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return new Double(eval.toString());
    }


}


