package _primerParcialFilaB.ejercicio5Interpreter;

public class TerminalExpressionStartX extends AbstractExpression {

    public TerminalExpressionStartX(int size) {
        this.size=size;
    }

    @Override
    public void interpreter(Context context) {
        String numeroR = context.input.substring(0, size);
        if (numeroR.equals("X")) {
            context.output = context.output + "10 ";
        }
        context.input = context.input.substring(this.size);
    }
}
