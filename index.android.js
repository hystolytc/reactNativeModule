/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import PhoneInput from 'react-native-phone-input'
import {
  AppRegistry,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
  NativeModules
} from 'react-native';

const MyToast = NativeModules.Toaslah;

export default class toaslah extends Component {
  /*render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to React Native!
        </Text>
        <TouchableOpacity onPress={()=>this.showToast('hello world long', 500)}>
          <Text>Show Hello world long</Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={()=>this.showToast('hello world short', 1)}>
          <Text>Show Hello world short</Text>
        </TouchableOpacity>
      </View>
    );
  }

  showToast(message, duration){
    MyToast.show(message,duration);
  }*/


render(){
    return(
        <PhoneInput />
    )
}
}

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     justifyContent: 'center',
//     alignItems: 'center',
//     backgroundColor: '#F5FCFF',
//   },
//   welcome: {
//     fontSize: 20,
//     textAlign: 'center',
//     margin: 10,
//   },
//   instructions: {
//     textAlign: 'center',
//     color: '#333333',
//     marginBottom: 5,
//   },
// });

AppRegistry.registerComponent('toaslah', () => toaslah);
