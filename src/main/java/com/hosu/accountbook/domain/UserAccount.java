package com.hosu.accountbook.domain;import jakarta.persistence.*;import lombok.Getter;import lombok.Setter;import lombok.ToString;@Getter@ToString@Entitypublic class UserAccount extends AuditingFields{    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;    @Setter @Column(nullable = false) private String email;    @Setter @Column(nullable = false) private String password;    @Setter @Column(nullable = false) private String userName;    protected UserAccount() {}    private UserAccount(String email, String password, String userName) {        this.email = email;        this.password = password;        this.userName = userName;    }    public static UserAccount of(String email, String password, String userName){        return new UserAccount(email, password, userName);    }}