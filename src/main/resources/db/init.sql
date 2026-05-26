-- Database initialization script for FinTrack

CREATE TABLE IF NOT EXISTS transactions (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    description VARCHAR(255) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    category VARCHAR(100),
    date DATE NOT NULL,
    type VARCHAR(20) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS categories (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name VARCHAR(100) NOT NULL UNIQUE,
    type VARCHAR(20) NOT NULL
);

-- Insert default categories
INSERT OR IGNORE INTO categories (name, type) VALUES ('Salário', 'income');
INSERT OR IGNORE INTO categories (name, type) VALUES ('Freelance', 'income');
INSERT OR IGNORE INTO categories (name, type) VALUES ('Alimentação', 'expense');
INSERT OR IGNORE INTO categories (name, type) VALUES ('Transporte', 'expense');
INSERT OR IGNORE INTO categories (name, type) VALUES ('Saúde', 'expense');
INSERT OR IGNORE INTO categories (name, type) VALUES ('Lazer', 'expense');
