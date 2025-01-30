import 'package:flutter/material.dart';
import 'screens/home_screen.dart';
import 'screens/news_screen.dart';
import 'screens/login_screen.dart';
import 'screens/settings_screen.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Crypto News',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      debugShowCheckedModeBanner: false, // Removes debug banner
      initialRoute: '/',
      routes: {
        '/': (context) => const HomeScreen(),
        '/news': (context) => const NewsScreen(),
        '/login': (context) => const LoginScreen(),
        '/settings': (context) => const SettingsScreen(),
      },
    );
  }
}
