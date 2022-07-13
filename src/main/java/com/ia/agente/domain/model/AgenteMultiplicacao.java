package com.ia.agente.domain.model;

import com.ia.agente.service.Extrator;

public class AgenteMultiplicacao extends Extrator implements Agente{
    private Integer prioridade;

    public AgenteMultiplicacao(Character operador, Integer prioridade) {
        super(operador);
        this.prioridade = prioridade;
    }

    public String calcular(String expressao) {
        String operandos[] = extrair(expressao);

        Double op1 = Double.parseDouble(operandos[1]);
        Double op2 = Double.parseDouble(operandos[2]);   

        Double multiplicacao = op1 * op2;
        return operandos[0]+multiplicacao+operandos[3];
    }

    public Character getOperacao() {
        return getOperador();
    }

    public Integer getPrioridade() {

        return this.prioridade;
    }
    
}
