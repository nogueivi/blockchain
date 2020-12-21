import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Login from './login';
import Dashboard from './dashboard';

type Props = Record<string, never>;

const Application: React.FunctionComponent<Props> = () => {
  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route exact path="/" render={() => <Login />} />
          <Route exact path="/dashboard" render={() => <Dashboard />} />
        </Switch>
      </BrowserRouter>
    </div>
  );
};

export default Application;
