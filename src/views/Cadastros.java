package views;

import cadalunos.Main;
import javax.swing.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Cadastros extends javax.swing.JFrame {

    public Cadastros() {        
        try {
            initComponents();
            ResultSet prof = Main.Connection().QueryExecute("SELECT id, nome FROM professores");
            ResultSet turm = Main.Connection().QueryExecute("SELECT id, nome FROM turmas");
            
            while(prof.next()) {
                this.cbProfessorMat.addItem(prof.getString("nome"));
            }
            while(turm.next()){
                this.cbTurmaAluno.addItem(turm.getString("nome"));
            }
        }        
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblLogoutProfessor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalvarProfessor = new javax.swing.JButton();
        lblNascimentoProfessor = new javax.swing.JLabel();
        txtNascimentoProfessor = new javax.swing.JTextField();
        txtEmailProfessor = new javax.swing.JTextField();
        lblEmailProfessor = new javax.swing.JLabel();
        lblTelefoneProfessor = new javax.swing.JLabel();
        txtTelefoneProfessor = new javax.swing.JTextField();
        txtMatriculaProfessor = new javax.swing.JTextField();
        lblMatriculaProfessor = new javax.swing.JLabel();
        lblCargaHorariaProfessor = new javax.swing.JLabel();
        txtCargaHorariaProfessor = new javax.swing.JTextField();
        txtNomeProfessor = new javax.swing.JTextField();
        lblNomeProfessor = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNomeAluno = new javax.swing.JTextField();
        lblNomeAluno = new javax.swing.JLabel();
        lblSobrenomeAluno = new javax.swing.JLabel();
        txtSobrenomeAluno = new javax.swing.JTextField();
        lblMatriculaAluno = new javax.swing.JLabel();
        txtMatriculaAluno = new javax.swing.JTextField();
        lblTelefoneAluno = new javax.swing.JLabel();
        txtTelefoneAluno = new javax.swing.JTextField();
        lblEmailAluno = new javax.swing.JLabel();
        txtEmailAluno = new javax.swing.JTextField();
        lblNascimentoAluno = new javax.swing.JLabel();
        txtNascimentoAluno = new javax.swing.JTextField();
        lblTurmaAluno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbTurmaAluno = new javax.swing.JComboBox<>();
        btnSalvarAluno = new javax.swing.JButton();
        lblLogoutAl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalvarMat = new javax.swing.JButton();
        cbProfessorMat = new javax.swing.JComboBox<>();
        lblProfessorMat = new javax.swing.JLabel();
        lblNomeMat = new javax.swing.JLabel();
        txtNomeMat = new javax.swing.JTextField();
        lblLogoutMat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNomeTurma = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        txtNomeTurma = new javax.swing.JTextField();
        btnSalvarTurma = new javax.swing.JButton();
        txtTurno = new javax.swing.JComboBox<>();
        lblLogoutTurma = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));

        lblLogoutProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutProfessorMouseClicked(evt);
            }
        });

        jLabel2.setText("jLabel1");

        btnSalvarProfessor.setText("Salvar");
        btnSalvarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProfessorActionPerformed(evt);
            }
        });

        lblNascimentoProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNascimentoProfessor.setText("Nascimento:");

        txtNascimentoProfessor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtEmailProfessor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmailProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmailProfessor.setText("Email:");

        lblTelefoneProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefoneProfessor.setText("Telefone:");

        txtTelefoneProfessor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMatriculaProfessor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMatriculaProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMatriculaProfessor.setText("Matrícula:");

        lblCargaHorariaProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargaHorariaProfessor.setText("Carga Horária:");

        txtCargaHorariaProfessor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtNomeProfessor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNomeProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeProfessor.setText("Nome:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEmailProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNomeProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCargaHorariaProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(txtCargaHorariaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMatriculaProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMatriculaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTelefoneProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefoneProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNascimentoProfessor)
                        .addGap(65, 65, 65)
                        .addComponent(txtNascimentoProfessor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoutProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoutProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProfessor)
                    .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatriculaProfessor)
                    .addComponent(txtMatriculaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargaHorariaProfessor)
                    .addComponent(txtCargaHorariaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneProfessor)
                    .addComponent(txtTelefoneProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailProfessor)
                    .addComponent(txtEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNascimentoProfessor)
                    .addComponent(txtNascimentoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144)
                .addComponent(btnSalvarProfessor)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Professores", jPanel3);

        txtNomeAluno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNomeAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeAluno.setText("Nome:");

        lblSobrenomeAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSobrenomeAluno.setText("Sobrenome:");

        txtSobrenomeAluno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMatriculaAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMatriculaAluno.setText("Matrícula:");

        txtMatriculaAluno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblTelefoneAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefoneAluno.setText("Telefone:");

        txtTelefoneAluno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmailAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmailAluno.setText("Email:");

        txtEmailAluno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNascimentoAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNascimentoAluno.setText("Nascimento:");

        txtNascimentoAluno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblTurmaAluno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTurmaAluno.setText("Turma:");

        jLabel1.setText("jLabel1");

        cbTurmaAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSalvarAluno.setText("Salvar");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });

        lblLogoutAl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutAlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNascimentoAluno)
                                    .addComponent(lblEmailAluno)
                                    .addComponent(lblTelefoneAluno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNascimentoAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblNomeAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblSobrenomeAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(txtSobrenomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblMatriculaAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLogoutAl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTurmaAluno)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMatriculaAluno)
                            .addComponent(txtMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeAluno)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSobrenomeAluno)
                            .addComponent(txtSobrenomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimentoAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailAluno)
                    .addComponent(txtEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneAluno)
                    .addComponent(txtTelefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurmaAluno)
                    .addComponent(cbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSalvarAluno)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addComponent(lblLogoutAl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Alunos", jPanel4);

        btnSalvarMat.setText("Salvar");
        btnSalvarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMatActionPerformed(evt);
            }
        });

        cbProfessorMat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        lblProfessorMat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfessorMat.setText("Professor:");

        lblNomeMat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeMat.setText("Nome:");

        txtNomeMat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblLogoutMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMatMouseClicked(evt);
            }
        });

        jLabel3.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeMat)
                    .addComponent(lblProfessorMat))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvarMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeMat, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(cbProfessorMat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLogoutMat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeMat)
                            .addComponent(txtNomeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorMat)
                    .addComponent(cbProfessorMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btnSalvarMat)
                .addGap(2, 2, 2)
                .addComponent(lblLogoutMat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Matérias", jPanel2);

        lblNomeTurma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeTurma.setText("Nome:");

        lblTurno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTurno.setText("Turno:");

        txtNomeTurma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnSalvarTurma.setText("Salvar");
        btnSalvarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTurmaActionPerformed(evt);
            }
        });

        txtTurno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespetino", "Noturno" }));

        lblLogoutTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutTurmaMouseClicked(evt);
            }
        });

        jLabel5.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeTurma)
                    .addComponent(lblTurno))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvarTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(txtTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 629, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoutTurma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTurma)
                    .addComponent(txtNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurno)
                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnSalvarTurma)
                .addGap(2, 2, 2)
                .addComponent(lblLogoutTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Turmas", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Turmas\nMatérias\nAlunos\nProfessores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutAlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutAlMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblLogoutAlMouseClicked

    private void lblLogoutTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutTurmaMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblLogoutTurmaMouseClicked

    private void lblLogoutMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMatMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblLogoutMatMouseClicked

    private void lblLogoutProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutProfessorMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblLogoutProfessorMouseClicked

    private void btnSalvarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTurmaActionPerformed
        try {            
            Main.Connection().FastQuery("INSERT INTO turmas VALUES(DEFAULT,'"+ this.txtNomeTurma.getText()+"', '"+ this.txtTurno.getSelectedItem().toString() +"')");
            JOptionPane.showMessageDialog(null, "Turma adicionada com sucesso!");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }           
    }//GEN-LAST:event_btnSalvarTurmaActionPerformed

    private void btnSalvarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProfessorActionPerformed
        try {
            String sql = "INSERT INTO professores VALUES(DEFAULT,"
            + "'"+this.txtNomeProfessor.getText()+"', '"+this.txtMatriculaProfessor.getText()+"',"
            + "'"+this.txtCargaHorariaProfessor.getText()+"', '"+this.txtTelefoneProfessor.getText()+"',"
            + "'"+this.txtEmailProfessor.getText()+"', '"+this.txtNascimentoProfessor.getText()+"');";
            
            Main.Connection().FastQuery(sql);
            JOptionPane.showMessageDialog(null, "Professor adicionado com sucesso!");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarProfessorActionPerformed

    private void btnSalvarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMatActionPerformed
        try {
            String sql = "INSERT INTO materia(nome, id_professor) VALUES("
            + "'"+this.txtNomeMat.getText()+"', '"+(this.cbProfessorMat.getSelectedIndex() + 1)+"');";

            Main.Connection().FastQuery(sql);
            JOptionPane.showMessageDialog(null, "Matéria adicionada com sucesso!");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }        
    }//GEN-LAST:event_btnSalvarMatActionPerformed

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        try{
            String sql = "INSERT INTO aluno VALUES(DEFAULT,"
            + "'"+this.txtMatriculaAluno.getText()+"', '"+this.txtNomeAluno.getText()+"',"
            + "'"+this.txtSobrenomeAluno.getText()+"', '"+this.txtNascimentoAluno.getText()+"',"
            + "'"+this.txtEmailAluno.getText()+"', '"+this.txtTelefoneAluno.getText()+"','"+(this.cbTurmaAluno.getSelectedIndex()+1)+"');";
            
            Main.Connection().FastQuery(sql);
            JOptionPane.showMessageDialog(null, "Aluno adcionado com sucesso!");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JButton btnSalvarMat;
    private javax.swing.JButton btnSalvarProfessor;
    private javax.swing.JButton btnSalvarTurma;
    private javax.swing.JComboBox<String> cbProfessorMat;
    private javax.swing.JComboBox<String> cbTurmaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCargaHorariaProfessor;
    private javax.swing.JLabel lblEmailAluno;
    private javax.swing.JLabel lblEmailProfessor;
    private javax.swing.JLabel lblLogoutAl;
    private javax.swing.JLabel lblLogoutMat;
    private javax.swing.JLabel lblLogoutProfessor;
    private javax.swing.JLabel lblLogoutTurma;
    private javax.swing.JLabel lblMatriculaAluno;
    private javax.swing.JLabel lblMatriculaProfessor;
    private javax.swing.JLabel lblNascimentoAluno;
    private javax.swing.JLabel lblNascimentoProfessor;
    private javax.swing.JLabel lblNomeAluno;
    private javax.swing.JLabel lblNomeMat;
    private javax.swing.JLabel lblNomeProfessor;
    private javax.swing.JLabel lblNomeTurma;
    private javax.swing.JLabel lblProfessorMat;
    private javax.swing.JLabel lblSobrenomeAluno;
    private javax.swing.JLabel lblTelefoneAluno;
    private javax.swing.JLabel lblTelefoneProfessor;
    private javax.swing.JLabel lblTurmaAluno;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextField txtCargaHorariaProfessor;
    private javax.swing.JTextField txtEmailAluno;
    private javax.swing.JTextField txtEmailProfessor;
    private javax.swing.JTextField txtMatriculaAluno;
    private javax.swing.JTextField txtMatriculaProfessor;
    private javax.swing.JTextField txtNascimentoAluno;
    private javax.swing.JTextField txtNascimentoProfessor;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeMat;
    private javax.swing.JTextField txtNomeProfessor;
    private javax.swing.JTextField txtNomeTurma;
    private javax.swing.JTextField txtSobrenomeAluno;
    private javax.swing.JTextField txtTelefoneAluno;
    private javax.swing.JTextField txtTelefoneProfessor;
    private javax.swing.JComboBox<String> txtTurno;
    // End of variables declaration//GEN-END:variables
}
