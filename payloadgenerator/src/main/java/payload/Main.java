package payload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Rule> rules = new LinkedHashMap<>();
        rules.put("loteIdcontrole", new Rule("int", null, 1, 1000, null));
        rules.put("loteIdcontroleRef", new Rule("string", 10, null, null, null));
        rules.put("loteDttransacao", new Rule("date", null, null, null, null));
        rules.put("loteConcessionaria", new Rule("int", null, 1, 10, null));
        rules.put("loteCdrodovia", new Rule("string", 5, null, null, null));
        rules.put("loteQtpassagensLote", new Rule("int", null, 1, 100, null));
        rules.put("loteTransacoes", new Rule("string", 20, null, null, null));
        rules.put("transacaoIdtransacao", new Rule("int", null, 1, 10000, null));
        rules.put("transacaoDccategoria", new Rule("string", 15, null, null, null));
        rules.put("transacaoNoplaca", new Rule("string", 7, null, null, null));
        rules.put("transacaoNoplacaOcr", new Rule("string", 7, null, null, null));
        rules.put("transacaoDtcriacao", new Rule("date", null, null, null, null));
        rules.put("transacaoDttransacao", new Rule("date", null, null, null, null));
        rules.put("transacaoNotag", new Rule("int", null, 1, 1000, null));
        rules.put("transacaoNopraca", new Rule("int", null, 1, 50, null));
        rules.put("wcdstatus", new Rule("int", null, 0, 5, null));
        rules.put("siteTpfuncionamento", new Rule("string", 10, null, null, null));
        rules.put("transacaoIdtransactionCode", new Rule("int", null, 1, 100, null));
        rules.put("transacaoIsFreeflowPayment", new Rule("boolean", null, null, null, null));
        rules.put("transacaoDtenvioIsNull", new Rule("boolean", null, null, null, null));
        rules.put("transacaoPlacaNoAlt", new Rule("boolean", null, null, null, null));
        rules.put("transacaoPlacaNoExcl", new Rule("boolean", null, null, null, null));
        rules.put("quitacaoMultiplaNoPaied", new Rule("boolean", null, null, null, null));
        rules.put("tagLiberada", new Rule("boolean", null, null, null, null));
        rules.put("tagVirtual", new Rule("boolean", null, null, null, null));
        rules.put("transacaoEvasorFlacao", new Rule("boolean", null, null, null, null));
        rules.put("movimentoEvasorPay", new Rule("boolean", null, null, null, null));
        rules.put("fnPlacaAcordo", new Rule("boolean", null, null, null, null));
        rules.put("transacaoFlenvio", new Rule("int", null, 1, 1000, null));
        rules.put("wdtlimitePagto", new Rule("date", null, null, null, null));
        rules.put("movimentoEvasorDtpagamento", new Rule("date", null, null, null, null));
        rules.put("transacaoCddelecao", new Rule("int", null, 1, 10, null));
        rules.put("transacaoCddelecaoOrig", new Rule("int", null, 1, 10, null));
        rules.put("transacaoCderro", new Rule("string", 20, null, null, null));
        rules.put("transacaoIsTagBlocked", new Rule("string", 5, null, null, null));
        rules.put("movimentoEvasorIdtransacao", new Rule("int", null, 1, 10000, null));
        rules.put("transacaoPathPhotoFront", new Rule("string", 50, null, null, null));
        rules.put("transacaoPathPhotoLateral1", new Rule("string", 50, null, null, null));
        rules.put("transacaoPathPhotoLateral2", new Rule("string", 50, null, null, null));


        Map<String, Object> payload = PayloadGenarator.generatePayload(rules);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(payload));
    }

    private static Rule createRule(String type, Integer length, Integer min, Integer max, String pattern) {
        Rule rule = new Rule();
        rule.setType(type);
        rule.setLength(length);
        rule.setMin(min);
        rule.setMax(max);
        rule.setPattern(pattern);

        return rule;
    }
}