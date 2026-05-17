import CalculatorVisitor from "./generated/CalculatorVisitor.js";

export class CustomCalculatorVisitor extends CalculatorVisitor {

    constructor() {
        super();
    }

    // Programa principal
    visitProgram(ctx) {

        return this.visitChildren(ctx);

    }

    // Declaración de función
    visitFunctionDeclaration(ctx) {

        const nombreFuncion = ctx.Identifier(0).getText();

        console.log(`\nFunción detectada: ${nombreFuncion}`);

        return this.visitChildren(ctx);

    }

    // console.log(...)
    visitConsoleStatement(ctx) {

        const resultado = this.visit(ctx.expression());

        console.log(`console.log => ${resultado}`);

        return resultado;

    }

    // Expresiones con + y -
    visitExpression(ctx) {

        // Caso simple
        if (ctx.term().length === 1) {
            return this.visit(ctx.term(0));
        }

        let resultado = this.visit(ctx.term(0));

        for (let i = 1; i < ctx.term().length; i++) {

            const operador = ctx.getChild(2 * i - 1).getText();

            const valor = this.visit(ctx.term(i));

            if (operador === '+') {
                resultado += valor;
            }
            else if (operador === '-') {
                resultado -= valor;
            }

        }

        return resultado;

    }

    // Términos
    visitTerm(ctx) {

        // Número
        if (ctx.Number()) {

            return parseInt(ctx.Number().getText());

        }

        // Identificador
        if (ctx.Identifier()) {

            const nombre = ctx.Identifier().getText();

            console.log(`Variable encontrada: ${nombre}`);

            // Valor ficticio para pruebas
            return 1;

        }

        // Expresión entre paréntesis
        return this.visit(ctx.expression());

    }

}