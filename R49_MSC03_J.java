public final Connection getConnection() throws SQLException {
  String username;
  String password;
  // Username and password are read at runtime from a secure config file
  return DriverManager.getConnection(
      "jdbc:mysql://localhost/dbName", username, password);
}
