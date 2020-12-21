import React from 'react';
import ReactDOM from 'react-dom';
import { createStore, applyMiddleware } from 'redux';
import { Provider } from 'react-redux';
import { BrowserRouter } from 'react-router-dom';

import reducers from './modules/reducers';
import Application from './components';
import 'antd/dist/antd.css';

const store = applyMiddleware()(createStore);

ReactDOM.render(
  <Provider store={store(reducers)}>
    <BrowserRouter>
      <Application />
    </BrowserRouter>
  </Provider>,
  document.getElementById('root')
);
