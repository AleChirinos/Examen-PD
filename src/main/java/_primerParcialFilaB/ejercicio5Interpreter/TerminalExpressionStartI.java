package _primerParcialFilaB.ejercicio5Interpreter;

public class TerminalExpressionStartI extends AbstractExpression {

    public TerminalExpressionStartI(int size) {
        this.size=size;
    }

    @Override
    public void interpreter(Context context) {
        String numeroRomano = context.input.substring(0,size);
        if(numeroRomano.equals("I")) {
            context.output = context.output + "1 ";
        }else if(numeroRomano.equals("II")) {
            context.output = context.output + "2 ";
        }else if(numeroRomano.equals("III")) {
            context.output = context.output + "3 ";
        }else if(numeroRomano.equals("IV")) {
            context.output = context.output + "4 ";
        }else if(numeroRomano.equals("IX")) {
            context.output = context.output + "9 ";
        }
        context.input = context.input.substring(this.size);
    }
}
