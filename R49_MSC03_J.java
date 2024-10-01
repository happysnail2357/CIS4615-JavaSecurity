public final Connection getConnection() throws SQLException {
  return DriverManager.getConnection(
      "jdbc:mysql://localhost/dbName",
      "username", "password");
}
