package src.classes;

public class User {
 private static int idCounter = 0;

 private int id;
 private String userName;
 private String userPassword;
 private Roles role;
 public User(String userName, String userPassword, Roles role){
  this.id = idCounter++;
  this.userName = userName;
  this.userPassword = userPassword;
  this.role = role;
 }

 public String getUserName() {
  return userName;
 }
 public void setUserName(String userName) {
  this.userName = userName;
 }

 public String getUserPassword() {
  return userPassword;
 }
 public void setUserPassword(String userPassword) {
  this.userPassword = userPassword;
 }
 public Roles getUserRole(){
  return role;
 }
 public void setUserRole(Roles role){
  this.role = role;
 }
 public Roles getRole() {
  return role;
 }

 public int getId() {
  return id;
 }
}
