package br.com.senacrs.usuario.appcadastro;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class TelaCadastroUsuario {
    MainActivity act;
    EditText edtnome, edtendereco, edttelefone;
    Button btncadastrar, btncancelar_cadastro;
    TelaPrincipal tela_principal;

    public TelaCadastroUsuario(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.telacadastro);
        edtnome = (EditText) act.findViewById(R.id.edtnome);
        edttelefone = (EditText) act.findViewById(R.id.edttelefone);
        edtendereco = (EditText) act.findViewById(R.id.edtendereco);
        btncadastrar = (Button) act.findViewById(R.id.btncadastrar);
        btncancelar_cadastro = (Button) act.findViewById(R.id.btncancelar_cadastro);
        btncadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuário?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                String nome = edtnome.getText().toString();
                                String telefone = edttelefone.getText().toString();
                                String endereco = edtendereco.getText().toString();
                                act.getaRegistro().add(new Registro(nome, telefone, endereco));
                                act.ExibirMensagem("Cadastroefetuado com sucesso.");
                                tela_principal.CarregarTela();
                            }
                        });
                dialogo.show();
            }});
        btncancelar_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Sair do cadastro ?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                tela_principal.CarregarTela();
                            }
                        });
                dialogo.show();
            }});
    }
}
