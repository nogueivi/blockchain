import React from 'react';
import { Row, Col, Button, Checkbox, Card, Form, Input } from 'antd';
import { UserOutlined, LockOutlined } from '@ant-design/icons';

type Props = Record<string, never>;

const Login: React.FunctionComponent<Props> = () => {
  const onSubmit = () => {
    // TODO
  };

  return (
    <Card
      bordered
      style={{
        position: 'absolute',
        width: '400px',
        height: '180px',
        top: '50%',
        left: '50%',
        margin: '-90px 0 0 -200px',
        backgroundColor: '#D7D7D7',
      }}
    >
      <Form onFinish={onSubmit}>
        <Form.Item name="username" rules={[{ required: true, message: 'Please input your Username!' }]}>
          <Input prefix={<UserOutlined />} placeholder="Username" />
        </Form.Item>
        <Form.Item name="password" rules={[{ required: true, message: 'Please input your Password!' }]}>
          <Input prefix={<LockOutlined />} type="password" placeholder="Password" />
        </Form.Item>
        <Row gutter={24}>
          <Col span={18}>
            <Form.Item name="remember" valuePropName="checked" noStyle>
              <Checkbox>Remember me</Checkbox>
            </Form.Item>
          </Col>
          <Col span={6}>
            <Form.Item>
              <Button type="primary" htmlType="submit">
                Log in
              </Button>
            </Form.Item>
          </Col>
        </Row>
      </Form>
    </Card>
  );
};

export default Login;
