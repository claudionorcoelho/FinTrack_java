package com.fintrack.model;

/**
 * Classe modelo para a entidade Transação
 * Representa uma transação financeira com informações como descrição, valor, categoria, data e tipo
 */
public class Transaction {
    // Identificador único da transação
    private int id;
    // Descrição da transação
    private String description;
    // Valor monetário da transação
    private double amount;
    // Categoria em que a transação se enquadra (ex: alimentação, transporte)
    private String category;
    // Data da transação no formato String
    private String date;
    // Tipo de transação: renda ou despesa
    private String type; // income (renda) ou expense (despesa)

    /**
     * Construtor padrão sem parâmetros
     * Inicializa uma transação vazia
     */
    public Transaction() {}

    /**
     * Construtor parametrizado
     * Inicializa uma transação com os dados fornecidos (exceto o ID, que é gerado automaticamente)
     * 
     * @param description Descrição da transação
     * @param amount Valor da transação
     * @param category Categoria da transação
     * @param date Data da transação
     * @param type Tipo da transação (income ou expense)
     */
    public Transaction(String description, double amount, String category, String date, String type) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }

    // ========== Getters e Setters ==========

    /**
     * Obtém o ID da transação
     * @return ID único da transação
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID da transação
     * @param id ID único a ser atribuído à transação
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém a descrição da transação
     * @return Descrição da transação
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define a descrição da transação
     * @param description Descrição a ser atribuída à transação
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtém o valor da transação
     * @return Valor monetário da transação
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Define o valor da transação
     * @param amount Valor monetário a ser atribuído à transação
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Obtém a categoria da transação
     * @return Categoria em que a transação se enquadra
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define a categoria da transação
     * @param category Categoria a ser atribuída à transação
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Obtém a data da transação
     * @return Data da transação em formato String
     */
    public String getDate() {
        return date;
    }

    /**
     * Define a data da transação
     * @param date Data a ser atribuída à transação
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Obtém o tipo da transação
     * @return Tipo da transação (income ou expense)
     */
    public String getType() {
        return type;
    }

    /**
     * Define o tipo da transação
     * @param type Tipo a ser atribuído à transação (income ou expense)
     */
    public void setType(String type) {
        this.type = type;
    }
}
