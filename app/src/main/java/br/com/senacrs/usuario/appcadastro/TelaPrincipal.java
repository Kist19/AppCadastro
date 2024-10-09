package br.com.senacrs.usuario.appcadastro;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btncadastrar_usuario;
    Button btn_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;
    public TelaPrincipal(MainActivity act){
        this.act = act;
    }
    @SuppressLint("ResourceType")
    public void CarregarTela(){
        act.setContentView(R.id.tela_principal);
        btncadastrar_usuario = (Button)
                act.findViewById(R.id.btncadastrar_usuario);
        btn_listar_usuarios_cadastrados = (Button)
                act.findViewById(R.id.btn_listar_usuarios_cadastrados);
        btncadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });
        btn_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_listagem.CarregarTela();
            }
        });
        public void setTelaCadastro(TelaCadastroUsuario tela_cadastro){
            this.tela_cadastro = tela_cadastro;
        }
        public void setTelaListagem(TelaListagemUsuarios tela_listagem){
            this.tela_listagem = tela_listagem;
        }
    }
}
