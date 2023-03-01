package dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate cargaHoraria;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(LocalDate cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

}
