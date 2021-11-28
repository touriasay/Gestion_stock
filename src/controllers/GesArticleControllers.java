package controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;



import application.ConnexionMysql;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import models.Article;

public class GesArticleControllers implements Initializable {
	Connection cnx;
	public PreparedStatement st;
	public java.sql.ResultSet result;
	 @FXML
	    private TextField txt_idArticle;
	
	 @FXML
	    private Button btn_recherche;
	    

	   @FXML
	    private Button btn_ajouter;

	    @FXML
	    private Button btn_modifier;

	    @FXML
	    private Button btn_supprimer;

	    @FXML
	    private TableColumn<Article, String> cin_Nom;

	    @FXML
	    private TableColumn<Article, Float> cin_PG;

	    @FXML
	    private TableColumn<Article, Float> cin_PU;

	    @FXML
	    private TableColumn<Article, Integer> cin_idArticle;

	    @FXML
	    private TableView<?> tab_Article;

	    @FXML
	    private TextField txt_PrisGros;

	    @FXML
	    private TextField txt_PrixUnitaire;

	    @FXML
	    private TextField txt_nomArticle;

	    @FXML
	    private TextField txt_recherche;
	    public ObservableList<Article> data = FXCollections.observableArrayList();
        // Ajouter des Articles 
	    @FXML
	    void ajouterArticle() {
	    	String idArticle=txt_idArticle.getText();
	    	String nomArticle=txt_nomArticle.getText();
	    	String PrixUnitaire=txt_PrixUnitaire.getText();
	    	String PrixGros=txt_PrisGros.getText();
	    	String sql="INSERT INTO `article`(`idArticle`, `nomArticle`, `PrixUnitaire`, `PrixGros`) VALUES (?,?,?,?)";
	    	   try {
	   			st =cnx.prepareStatement(sql);
	   			result =st.executeQuery();
	   			
	   		    st.setString(1, idArticle);
	   			st.setString(2, nomArticle);
                st.setString(3, PrixUnitaire);
	   			st.setString(4, PrixGros);	   		
	   			st.execute();
	   			txt_idArticle.setText("");
	   			txt_nomArticle.setText("");
	   			txt_PrisGros.setText("");
	   			txt_PrixUnitaire.setText("");
	   			txt_recherche.setText("");
	   			Alert  alert=new Alert(AlertType.CONFIRMATION,"Locataire ajouter avec succés ",ButtonType.OK);
	   			alert.showAndWait();
	   			showArticle();
	   		} catch (SQLException e) {
	   			// TODO Auto-generated catch block
	   			e.printStackTrace();
	   		}

	    }
    //Modifier un Article 
	    @FXML
	    void modifierArticle() {
	    	String idArticle=txt_idArticle.getText();
	    	String nomArticle=txt_nomArticle.getText();
	    	String PrixUnitaire=txt_PrixUnitaire.getText();
	    	String PrixGros=txt_PrisGros.getText();
	    	String sql="UPDATE `article` SET `idArticle`=?,`nomArticle`=?,`PrixUnitaire`=?,`PrixGros`=? WHERE idArticle= '"+txt_recherche.getText() +"'";
	    	   try {
		   			st =cnx.prepareStatement(sql);
		   			result =st.executeQuery();
		   			
		   		    st.setString(1, idArticle);
		   			st.setString(2, nomArticle);
	                st.setString(3, PrixUnitaire);
		   			st.setString(4, PrixGros);	   		
		   			st.executeUpdate();
		   			txt_idArticle.setText("");
		   			txt_nomArticle.setText("");
		   			txt_PrisGros.setText("");
		   			txt_PrixUnitaire.setText("");
		   			txt_recherche.setText("");
		   			Alert  alert=new Alert(AlertType.CONFIRMATION,"Locataire modifier avec succés ",ButtonType.OK);
		   			alert.showAndWait();
		   			showArticle();
		   		} catch (SQLException e) {
		   			// TODO Auto-generated catch block
		   			e.printStackTrace();
		   		}
	    }
	    // Supprimer des Articles

	    @FXML
	    void supprimerArtcile() {
	   String sql= "DELETE FROM `article` WHERE idArticle ='"+txt_recherche.getText()+"'";
	   try {
		st =cnx.prepareStatement(sql);
		st.executeUpdate();
		txt_idArticle.setText("");
			txt_nomArticle.setText("");
			txt_PrisGros.setText("");
			txt_PrixUnitaire.setText("");
			txt_recherche.setText("");
			Alert  alert=new Alert(AlertType.CONFIRMATION,"Locataire supprimer avec succés ",ButtonType.OK);
			alert.showAndWait();
			showArticle();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	    }
	    // Rechercher des Article
	    @FXML
	    void rechercheArticle() {
     String sql="select * from Article where idArticle ='"+txt_recherche.getText()+"'";
     int m=0;
     try {
			st =cnx.prepareStatement(sql);
			result =st.executeQuery();
		if(result.next()) {
			txt_idArticle.setText(result.getString("idArticle"));
			txt_nomArticle.setText(result.getString("nomArticle"));
			txt_PrixUnitaire.setText(result.getString("PrixUnitaire"));
			txt_PrisGros.setText(result.getString("PrixGros"));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     if(m==0) {
    	 Alert alert  =new Alert(AlertType.ERROR,"Aucun Article trouvé",ButtonType.OK);
    	 alert.showAndWait();
    	 }
	    }
	 
	   // afficher les Articles dans la table  
	    public void showArticle() {
	    	tab_Article.getItems().clear();
	  	String sql= "select * from Article";
	  	try {
			st =cnx.prepareStatement(sql);
			result =st.executeQuery();
		while(result.next()) {
			data.add(new Article(result.getInt("idArticle"), result.getString("nomArticle"),result.getFloat("PrixUnitaire"),result.getFloat("PrixGros")));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	cin_idArticle.setCellValueFactory(new  PropertyValueFactory<Article,Integer>("idArticle"));
	  	cin_Nom.setCellValueFactory(new PropertyValueFactory<Article, String>("nomArticle") );
	  	cin_PU.setCellValueFactory(new PropertyValueFactory<Article, Float>("PrixUnitaire") );
	   	cin_PG.setCellValueFactory(new PropertyValueFactory<Article, Float>("PrixGros") );
	   	tab_Article.setItems(data);
	  	}
	 
	    	
	   

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cnx = ConnexionMysql.connexionDB();
		showArticle();
		
	}

}
