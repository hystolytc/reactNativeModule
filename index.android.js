import React, { Component } from 'react';
import { AppRegistry, Text, View, Navigator, BackAndroid } from 'react-native';
import Contact from './Contact';
import {
  AppRegistry,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
  NativeModules
} from 'react-native';

const Contact = NativeModules.Contact;

export default class toaslah extends Component {
 render() {
    var initialRoute = { name:'bridge', title: strings.signup }
    return (
      <Navigator
        initialRoute={initialRoute}
        renderScene={RouteMapper}
        ref={(nav) => { this.navigator = nav }}
        />
    );
  }

  componentDidMount() {
    BackAndroid.addEventListener('hardwareBackPress', this.onBackPress.bind(this));
  }

  onBackPress() {
    if (this.navigator && this.navigator.getCurrentRoutes().length > 1) {
        this.navigator.pop();
        return true;
    }
    return false;
  }
}

var RouteMapper = function(route, navigator) {
  switch (route.name) {
    case 'pin':
      return (
        <Pin
          title={route.title}
          navigator={navigator}
          />
      );
      break;
    case 'login':
      return (
        <Login
          navigator={navigator}
          />
      );
      break;
    case 'bridge':
      return (
        <BridgetList
          navigator={navigator}
          />
        );
      break
    case 'contact':
      return (
        <Contact
          navigator={navigator}
          />
        );
      break;
    case 'notif':
      return (
        <Notif
          navigator={navigator}
          />
        );
      break;
    case 'receiver':
      return (
        <Receiver
          navigator={navigator}
          />
        );
      break;
    case 'service':
      return (
        <Service
          navigator={navigator}
          />
        );
      break;
    case 'sms':
      return (
        <Sms
          navigator={navigator}
          />
        );
      break;
    case 'db':
      return (
        <Database
          navigator={navigator}
          />
        );
      break;
    default:
      break;
  }
}

AppRegistry.registerComponent('toaslah', () => toaslah);
