import { render, screen } from '@testing-library/react';
import App from './App';

describe('App Component is being rendered successfully',()=>{
  // Component Test
  test('renders learn react link', () => {
    render(<App />);
    const linkElement = screen.getByText(/hello react/i);
    // mark the assertion for the hyper link 
    expect(linkElement).toBeInTheDocument();
  });

  // dummy test 
  test('Addition of 2 & 3 is 5',()=>{
    const result = 2 + 3;
    // assert the addition result
    expect(result).toBe(5);
  });

  // Complex Test
  
});
