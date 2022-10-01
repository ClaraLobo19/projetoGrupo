package model;

public class CadastroInstituicao {
	
	private String nomeInstituicao;
	private String razaoSocial;
	private String email;
	private String cidade;
	private String estado;
	private String telefone;
	private String sobreCausa;
	private String linkDoacao;
	private String LinkCadastroAlunos;
	
	
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSobreCausa() {
		return sobreCausa;
	}
	public void setSobreCausa(String sobreCausa) {
		this.sobreCausa = sobreCausa;
	}
	public String getLinkDoacao() {
		return linkDoacao;
	}
	public void setLinkDoacao(String linkDoacao) {
		this.linkDoacao = linkDoacao;
	}
	public String getLinkCadastroAlunos() {
		return LinkCadastroAlunos;
	}
	public void setLinkCadastroAlunos(String linkCadastroAlunos) {
		LinkCadastroAlunos = linkCadastroAlunos;
	}
	
}







/*
 *  URL url = new URL("http://localhost/zipado.zip"); //conecta com localhost e busca o arquivo a ser baixado
 *  InputStream is = url.openStream();  // abre um fluxo de dados para baixar o arquivo
    ZipInputStream zin = new ZipInputStream(is); // cria um fluxo para ler arquivos zipados
    File f = new File("C:/saida/zipado.zip"); // cria um arquivo de saida
    FileOutputStream fout = new FileOutputStream(f); // abre um fluxo para gravar os dados no disco
    ZipOutputStream zos = new ZipOutputStream(fout); // cria um fluxo para zipar dados
    while (true) {
        ZipEntry ze = zin.getNextEntry(); // recebe os "entrys" do arquivos baixado
        if(ze==null) // verifica se ja recebeu todos os "entrys"
            break;
        System.out.println("Unzipping " + ze.getName()); // apresenta os "entrys"
        zos.putNextEntry(ze); // posiciona o próximo entry
        for (int c = zin.read(); c != -1; c = zin.read()) {               
                zos.write(c);   // escreve os dados no arquivo               
        }
        zos.closeEntry(); // fecha o entry
   }
   zos.close(); // fecha para zipar dados
   fout.close(); // fecha para gravar no disco
   zin.close(); // fecha o fluxo de entrada
}
*/
