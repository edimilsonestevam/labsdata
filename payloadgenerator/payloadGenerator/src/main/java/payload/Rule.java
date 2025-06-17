package payload;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rule {
    private String type;
    private Integer length;
    private Integer min;
    private Integer max;
    private String pattern;

    private int loteIdcontrole;
    private String loteIdcontroleRef;
    private Date loteDttransacao;
    private int loteConcessionaria;
    private String loteCdrodovia;
    private int loteQtpassagensLote;
    private String loteTransacoes;
    private int transacaoIdtransacao;
    private String transacaoDccategoria;
    private String transacaoNoplaca;
    private String transacaoNoplacaOcr;
    private Date transacaoDtcriacao;
    private Date transacaoDttransacao;
    private int transacaoNotag;
    private int transacaoNopraca;
    private int wcdstatus;
    private String siteTpfuncionamento;
    private int transacaoIdtransactionCode;
    private Boolean transacaoIsFreeflowPayment;
    private Boolean transacaoDtenvioIsNull;
    private Boolean transacaoPlacaNoAlt;
    private Boolean transacaoPlacaNoExcl;
    private Boolean quitacaoMultiplaNoPaied;
    private Boolean tagLiberada;
    private Boolean tagVirtual;
    private Boolean transacaoEvasorFlacao;
    private Boolean movimentoEvasorPay;
    private Boolean fnPlacaAcordo;
    private int transacaoFlenvio;
    private Date wdtlimitePagto;
    private Date movimentoEvasorDtpagamento;
    private int transacaoCddelecao;
    private int transacaoCddelecaoOrig;
    private String transacaoCderro;
    private String transacaoIsTagBlocked;
    private int movimentoEvasorIdtransacao;
    private String transacaoPathPhotoFront;
    private String transacaoPathPhotoLateral1;
    private String transacaoPathPhotoLateral2;

    public Rule(
            int loteIdcontrole,
            String loteIdcontroleRef,
            Date loteDttransacao,
            int loteConcessionaria,
            String loteCdrodovia,
            int loteQtpassagensLote,
            String loteTransacoes,
            int transacaoIdtransacao,
            String transacaoDccategoria,
            String transacaoNoplaca,
            String transacaoNoplacaOcr,
            Date transacaoDtcriacao,
            Date transacaoDttransacao,
            int transacaoNotag,
            int transacaoNopraca,
            int wcdstatus,
            String siteTpfuncionamento,
            int transacaoIdtransactionCode,
            Boolean transacaoIsFreeflowPayment,
            Boolean transacaoDtenvioIsNull,
            Boolean transacaoPlacaNoAlt,
            Boolean transacaoPlacaNoExcl,
            Boolean quitacaoMultiplaNoPaied,
            Boolean tagLiberada,
            Boolean tagVirtual,
            Boolean transacaoEvasorFlacao,
            Boolean movimentoEvasorPay,
            Boolean fnPlacaAcordo,
            int transacaoFlenvio,
            Date wdtlimitePagto,
            Date movimentoEvasorDtpagamento,
            int transacaoCddelecao,
            int transacaoCddelecaoOrig,
            String transacaoCderro,
            String transacaoIsTagBlocked,
            int movimentoEvasorIdtransacao,
            String transacaoPathPhotoFront,
            String transacaoPathPhotoLateral1,
            String transacaoPathPhotoLateral2
    ) {

        this.type = type;
        this.pattern = pattern;

        this.loteIdcontrole = loteIdcontrole;
        this.loteIdcontroleRef = loteIdcontroleRef;
        this.loteDttransacao = loteDttransacao;
        this.loteConcessionaria = loteConcessionaria;
        this.loteCdrodovia = loteCdrodovia;
        this.loteQtpassagensLote = loteQtpassagensLote;
        this.loteTransacoes = loteTransacoes;
        this.transacaoIdtransacao = transacaoIdtransacao;
        this.transacaoDccategoria = transacaoDccategoria;
        this.transacaoNoplaca = transacaoNoplaca;
        this.transacaoNoplacaOcr = transacaoNoplacaOcr;
        this.transacaoDtcriacao = transacaoDtcriacao;
        this.transacaoDttransacao = transacaoDttransacao;
        this.transacaoNotag = transacaoNotag;
        this.transacaoNopraca = transacaoNopraca;
        this.wcdstatus = wcdstatus;
        this.siteTpfuncionamento = siteTpfuncionamento;
        this.transacaoIdtransactionCode = transacaoIdtransactionCode;
        this.transacaoIsFreeflowPayment = transacaoIsFreeflowPayment;
        this.transacaoDtenvioIsNull = transacaoDtenvioIsNull;
        this.transacaoPlacaNoAlt = transacaoPlacaNoAlt;
        this.transacaoPlacaNoExcl = transacaoPlacaNoExcl;
        this.quitacaoMultiplaNoPaied = quitacaoMultiplaNoPaied;
        this.tagLiberada = tagLiberada;
        this.tagVirtual = tagVirtual;
        this.transacaoEvasorFlacao = transacaoEvasorFlacao;
        this.movimentoEvasorPay = movimentoEvasorPay;
        this.fnPlacaAcordo = fnPlacaAcordo;
        this.transacaoFlenvio = transacaoFlenvio;
        this.wdtlimitePagto = wdtlimitePagto;
        this.movimentoEvasorDtpagamento = movimentoEvasorDtpagamento;
        this.transacaoCddelecao = transacaoCddelecao;
        this.transacaoCddelecaoOrig = transacaoCddelecaoOrig;
        this.transacaoCderro = transacaoCderro;
        this.transacaoIsTagBlocked = transacaoIsTagBlocked;
        this.movimentoEvasorIdtransacao = movimentoEvasorIdtransacao;
        this.transacaoPathPhotoFront = transacaoPathPhotoFront;
        this.transacaoPathPhotoLateral1 = transacaoPathPhotoLateral1;
        this.transacaoPathPhotoLateral2 = transacaoPathPhotoLateral2;
    }
    public Rule(String type, Integer length, Integer min, Integer max, String pattern) {
        this.type = type;
        this.length = length;
        this.min = min;
        this.max = max;
        this.pattern = pattern;
    }
}