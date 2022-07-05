//DelCal.java
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.event.*;
public class DelCal extends Application{
	String str="",dstr="",temp="",ans="";
	char op,eq;
	public void start(Stage st) throws Exception{
		
		System.out.println("From star()method..");
		Scene sc;
		
		Group g=new Group();
		Text t1,t2;
		Text t3;
		t1=new Text();
		t1.setX(0);
		t1.setY(20);
		t1.setFont(Font.font("Times New Roman",FontWeight.THIN,FontPosture.ITALIC,20)); 
		t3=new Text();
		t3.setX(0);
		t3.setY(80);
		t3.setFont(Font.font("Times New Roman",FontWeight.THIN,FontPosture.ITALIC,60)); 
		

		g.getChildren().addAll(t1,t3);
		//rem
		Button per=new Button("%");
		per.setLayoutX(5);
		per.setLayoutY(90);
		per.setPrefSize(75,45);
		g.getChildren().add(per);
		per.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				str=str.concat("%");
				dstr=dstr.concat("%");
				t1.setText(str);
			}
		});
		//ce button
		Button ce=new Button("CE");
		ce.setLayoutX(85);
		ce.setLayoutY(90);
		ce.setPrefSize(75,45);
		g.getChildren().add(ce);
		//c button
		Button c=new Button("C");
		c.setLayoutX(165);
		c.setLayoutY(90);
		c.setPrefSize(75,45);
		g.getChildren().add(c);
		c.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				eq=' ';
				str="";
				t1.setText(str);
				ans="";
				op=' ';
				dstr="";
				t3.setText(ans);
			}
		});
		//Backspace Button
		Button bks=new Button("bk");
		bks.setLayoutX(245);
		bks.setLayoutY(90);
		bks.setPrefSize(75,45);
		g.getChildren().add(bks);
		bks.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				char[] str1=str.toCharArray();
				int i=0,strLen=str.length()-1;
				if((str!="")&&(eq!='=')){
					str="";
				while(strLen>0){
					str=str.concat(String.valueOf(str1[i]));
					i+=1;
					strLen-=1;
				}
				t1.setText(dstr+op+str);
				}
			}
			
		});
				//+
		Button add=new Button("+");
		add.setLayoutX(245);
		add.setLayoutY(290);
		add.setPrefSize(75,45);
		g.getChildren().add(add);
		add.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				//str=str.concat("+");
				eq=' ';
				op='+';
				dstr=str;
				str="";
				t1.setText(dstr+op+str);
			}
		});	
		//7
		Button no7=new Button("7");
		no7.setLayoutX(5);
		no7.setLayoutY(190);
		no7.setPrefSize(75,45);
		g.getChildren().add(no7);
		//no7 action
		no7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("7");
					t1.setText(dstr+op+str);
				}
			}
		});		
		//x
		Button mul=new Button("x");
		mul.setLayoutX(245);
		mul.setLayoutY(190);
		mul.setPrefSize(75,45);
		g.getChildren().add(mul);
		mul.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				//str=str.concat("*");
				eq=' ';
				op='*';
				dstr=str;
				str="";
				t1.setText(dstr+op+str);
			}
		});
		
		//1/x
		Button xdiv=new Button("1/x");
		xdiv.setLayoutX(5);
		xdiv.setLayoutY(140);
		xdiv.setPrefSize(75,45);
		g.getChildren().add(xdiv);
		//x^2
		Button sqr=new Button("x^2");
		sqr.setLayoutX(85);
		sqr.setLayoutY(140);
		sqr.setPrefSize(75,45);
		g.getChildren().add(sqr); 
		//sqt(x);
		Button sqt=new Button("sqt(x)");
		sqt.setLayoutX(165);
		sqt.setLayoutY(140);
		sqt.setPrefSize(75,45);
		g.getChildren().add(sqt);
		//div
		Button div=new Button("/");
		div.setLayoutX(245);
		div.setLayoutY(140);
		div.setPrefSize(75,45);
		g.getChildren().add(div);
		div.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				//str=str.concat("/");
				eq=' ';
				op='/';
				dstr=str;
				str="";
				t1.setText(dstr+op+str);
			}
		});

		//8
		Button no8=new Button("8");
		no8.setLayoutX(85);
		no8.setLayoutY(190);
		no8.setPrefSize(75,45);
		g.getChildren().add(no8);
		no8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("8");
					t1.setText(dstr+op+str);
				}
			}
		});
		//9
		Button no9=new Button("9");
		no9.setLayoutX(165);
		no9.setLayoutY(190);
		no9.setPrefSize(75,45);
		g.getChildren().add(no9);
		no9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("9");
					t1.setText(dstr+op+str);
				}
			}
		});
		//4
		Button no4=new Button("4");
		no4.setLayoutX(5);
		no4.setLayoutY(240);
		no4.setPrefSize(75,45);
		g.getChildren().add(no4);
		no4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("4");
					t1.setText(dstr+op+str);
				}
			}
		});
		//5
		Button no5=new Button("5");
		no5.setLayoutX(85);
		no5.setLayoutY(240);
		no5.setPrefSize(75,45);
		g.getChildren().add(no5);
		no5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("5");
					t1.setText(dstr+op+str);
				}
			}
		});
		//6
		Button no6=new Button("6");
		no6.setLayoutX(165);
		no6.setLayoutY(240);
		no6.setPrefSize(75,45);
		g.getChildren().add(no6);
		no6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("6");
					t1.setText(dstr+op+str);
				}
			}
		});
		//-
		Button sub=new Button("-");
		sub.setLayoutX(245);
		sub.setLayoutY(240);
		sub.setPrefSize(75,45);
		g.getChildren().add(sub);
		sub.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				eq=' ';
				op='-';
				dstr=str;
				str="";
				t1.setText(dstr+op+str);
			}
		});
		//1
		Button no1=new Button("1");
		no1.setLayoutX(5);
		no1.setLayoutY(290);
		no1.setPrefSize(75,45);
		g.getChildren().add(no1);
		no1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("1");
					t1.setText(dstr+op+str);
				}
			}
		});
		//2
		Button no2=new Button("2");
		no2.setLayoutX(85);
		no2.setLayoutY(290);
		no2.setPrefSize(75,45);
		g.getChildren().add(no2);
		no2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("2");
					t1.setText(dstr+op+str);
				}
			}
		});
		//3
		Button no3=new Button("3");
		no3.setLayoutX(165);
		no3.setLayoutY(290);
		no3.setPrefSize(75,45);
		g.getChildren().add(no3);
		no3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("3");
					t1.setText(dstr+op+str);
				}
			}
		});

		//+/-
		Button as=new Button("+/-");
		as.setLayoutX(5);
		as.setLayoutY(340);
		as.setPrefSize(75,45);
		g.getChildren().add(as);
		//0
		Button no0=new Button("0");
		no0.setLayoutX(85);
		no0.setLayoutY(340);
		no0.setPrefSize(75,45);
		g.getChildren().add(no0);
		no0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat("0");
					t1.setText(dstr+op+str);
				}
			}
		});
		//.
		Button fs=new Button(".");
		fs.setLayoutX(165);
		fs.setLayoutY(340);
		fs.setPrefSize(75,45);
		g.getChildren().add(fs);
		fs.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				if(eq!='='){
					str=str.concat(".");
					t1.setText(dstr+op+str);
				}
			}
		});
		//=
		Button eqs=new Button("=");
		eqs.setLayoutX(245);
		eqs.setLayoutY(340);
		eqs.setPrefSize(75,45);
		g.getChildren().add(eqs);
		eqs.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				eq='=';
				t1.setText(dstr+op+str+eq);
				if(op=='+')
					ans=String.valueOf(Double.valueOf(dstr)+Double.valueOf(str));
				else if(op=='-')
					ans=String.valueOf(Double.valueOf(dstr)-Double.valueOf(str));
				else if((op=='/')&&(Double.valueOf(str)!=0))
					ans=String.valueOf(Double.valueOf(dstr)/Double.valueOf(str));
				else if(op=='*')
					ans=String.valueOf(Double.valueOf(dstr)*Double.valueOf(str));
				else if((op=='%')&&(Double.valueOf(str)!=0))
					ans=String.valueOf(Double.valueOf(dstr)%Double.valueOf(str));
				t3.setText(ans);
				temp=str;
				str=ans;
			}
		});
		Image icon=new Image("IndiaMap.jpg");
		sc =new Scene(g,325,390);
		st.getIcons().add(icon);
		st.setTitle("GRAPH");
		st.setScene(sc);
		st.show();
	}
}