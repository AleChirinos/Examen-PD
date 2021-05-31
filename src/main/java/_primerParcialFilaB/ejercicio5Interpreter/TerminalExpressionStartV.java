package _primerParcialFilaB.ejercicio5Interpreter;

public class TerminalExpressionStartV extends AbstractExpression {

    public TerminalExpressionStartV(int size) {
        this.size=size;
    }

    @Override
    public void interpreter(Context context) {
        String numeroRomano = context.input.substring(0, size);
        if (numeroRomano.equals("V")) {
            context.output = context.output + "5 ";
        } else if (numeroRomano.equals("VI")) {
            context.output = context.output + "6 ";
        } else if (numeroRomano.equals("VII")) {
            context.output = context.output + "7 ";
        } else if (numeroRomano.equals("VIII")) {
            context.output = context.output + "8 ";
        }
        context.input = context.input.substring(this.size);
    }
}
