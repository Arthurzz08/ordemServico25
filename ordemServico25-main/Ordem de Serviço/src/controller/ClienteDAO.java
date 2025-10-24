/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author clebe
 */
public class ClienteDAO {
    
        try {

            //1 passo criar a lista
            List<Cliente> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from tbclientes";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setId(rs.getInt("idcli"));
                obj.setNome(rs.getString("nomecli"));
                obj.setEndereco(rs.getString("endcli"));
                obj.setEmail(rs.getString("emailcli"));
                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }
    
    
}
