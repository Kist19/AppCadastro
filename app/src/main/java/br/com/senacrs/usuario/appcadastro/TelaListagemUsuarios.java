package br.com.senacrs.usuario.appcadastro;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaListagemUsuarios {
    MainActivity act;
    TelaPrincipal tela_principal;
    Button btanterior, btproximo, btfechar;
    TextView txtnome, txttelefone, txtendereco, txtstatus;
    int index;

    public TelaListagemUsuarios(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
        index = 0;
    }

    public void CarregarTela() {
        //Antes de carregar a tela, verifica se existe registros
        //inseridos
        if(act.getaRegistro().size() == 0){
            (new AlertDialog.Builder(act)).setTitle("Aviso")
                    .setMessage("Não existe nenhum registro cadastrado.")
                    .setNeutralButton("OK", null).show();
            return;
        }
        act.setContentView(R.layout.visualizacaodados);
        btanterior = (Button) act.findViewById(R.id.btnanterior);
        btproximo = (Button) act.findViewById(R.id.btnproximo);
        btfechar = (Button) act.findViewById(R.id.btnfechar);
        txtnome = (TextView) act.findViewById(R.id.txtnome);
        txtendereco = (TextView) act.findViewById(R.id.txtendereco);
        txttelefone = (TextView) act.findViewById(R.id.txttelefone);
        txtstatus = (TextView) act.findViewById(R.id.txtstatus);
        PreencherCampos(index);
        AtualizarStatus(index);
        btanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index > 0){
                    index--;
                    PreencherCampos(index);
                    AtualizarStatus(index);
                }
            }
        });
        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < act.getaRegistro().size() - 1) {
                    index++;
                    PreencherCampos(index);
                    AtualizarStatus(index);
                }
            } });
        btfechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_principal.CarregarTela();
            }
        });

    }
    private void PreencherCampos(int idx){
        txtnome.setText(act.getaRegistro().get(idx).getNome());
        txttelefone.setText(act.getaRegistro().get(idx).getTelefone());
        txtendereco.setText(act.getaRegistro().get(idx).getEndereco());
    }
    private void AtualizarStatus(int idx){
        int total = act.getaRegistro().size();
        txtstatus.setText("Registros : " + (idx+1) +"/" + total);
    }
}
