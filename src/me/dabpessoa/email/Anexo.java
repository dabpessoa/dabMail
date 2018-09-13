package me.dabpessoa.email;

public class Anexo {

    private String nome;
    private String mimeType;
    private byte[] bytes;

    public Anexo() {}

    public Anexo(String nome, byte[] bytes) {
        this.nome = nome;
        this.bytes = bytes;
    }

    public Anexo(String nome, String mimeType, byte[] bytes) {
        this.nome = nome;
        this.mimeType = mimeType;
        this.bytes = bytes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

}