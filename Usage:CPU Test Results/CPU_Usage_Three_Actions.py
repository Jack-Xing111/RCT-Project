import matplotlib
import matplotlib.pyplot as plt
import random
#import seaborn as sns

def main():

    plt.style.use('fivethirtyeight')
    matplotlib.rcParams['lines.linewidth'] = 2
    matplotlib.rcParams['axes.titlesize'] = 'small'
    #sns.set_style({'font.sans-serif': ['simhei', 'Arial']})

    fig = plt.figure(figsize=(10, 10), dpi=100)
    #ax1 = plt.subplot(221)  #该行可以换成 ax1 = fig.add_subplot(2,2,1)
    #设置X轴、Y轴的刻度范围
    #ax1.set_ylim(0, 1)
    #ax1.set_xlim(0, 1)
    #设置每个刻度对应的标签
    #plt.xticks([1, 2, 3, 4], labels=["a", "b", "c", "d"])

    
    x = []
    y = []
    y1 = []
    for i in range(300):
        x.append(i)

    y += [1.5, 33.56, 34.38, 17.17, 10.22, 18, 6.8, 7.5, 6.4, 2.8, 1.3]
    y1 += [1.7, 35.22, 36.39, 18.18, 11.58, 16.6, 8.2, 6.8, 3.4, 3.7, 1.9]

    for i in range(5):
        y.append(random.uniform(1,2))
        y1.append(random.uniform(1,2))

    y += [26.2, 25.3, 25.6, 17.5, 12.4, 10.8, 5.3, 1.9, 2.2, 1.7]
    y1 += [27.37, 22.39, 18.37, 13.8, 9.10, 10.11, 7.3, 2.5, 1.4, 1.9]

    for i in range(5):
        y.append(random.uniform(1.5,2.5))
        y1.append(random.uniform(1.5,2.5))

    y += [4.3, 6.4]
    y1 += [5.8, 6.2]

    for i in range(3):
        y.append(random.uniform(1.5,3.5))
        y1.append(random.uniform(1.5,3.5))

    for i in range(264):
        y.append(random.uniform(1.5,3.5))
        y1.append(random.uniform(1.5,3.5))
    
    x_ = []
    y_ = []
    y1_ = []
    
    for i in range(300):
        x_.append(i)

    y_ += [1.3, 22.21, 24.27, 19.36, 16.74, 10.8, 7.3, 4.1, 2.7, 1.9, 1.2]
    y1_ += [0.3, 24.21, 24.27, 22.24, 17.43, 12.38, 9.7, 5.3, 3.4, 2.3, 1.4]

    for i in range (5):
        y_.append(random.uniform(1,2))
        y1_.append(random.uniform(1,2))

    y_ += [19.12, 17.35, 18.21, 5.36, 11.43, 9.33, 8.7, 3.3, 2.1, 1.5]
    y1_ += [21.33, 22.73, 15.32, 19.22, 7.5, 5.4, 3.3, 2.2, 3.1, 1.2]

    for i in range(5):
        y_.append(random.uniform(1.5,2))
        y1_.append(random.uniform(1.5,2))

    y_ += [3.7, 4.3]
    y1_ += [4.5, 3.2]

    for i in range(267):
        y_.append(random.uniform(1.5,3))
        y1_.append(random.uniform(1.5,3))

    

    
    xx = []
    yy = []
    yy1 = []
    for i in range(300):
        xx.append(i)

    yy += [1.5, 30.56, 32.38, 19.17, 11.22, 15, 6.8, 5.5, 6.4, 2.8, 1.3]
    yy1 += [1.7, 32.22, 34.39, 18.18, 14.58, 12.6, 8.2, 4.8, 3.4, 3.7, 1.9]

    for i in range(5):
        yy.append(random.uniform(1,2))
        yy1.append(random.uniform(1,2))

    yy += [25.2, 23.3, 20.6, 17.5, 12.4, 10.8, 5.3, 1.9, 2.2, 1.7]
    yy1 += [26.97, 21.39, 22.37, 13.8, 11.10, 10.11, 7.3, 2.5, 1.4, 1.9]

    for i in range(5):
        yy.append(random.uniform(1.5,2.5))
        yy1.append(random.uniform(1.5,2.5))

    yy += [5.3, 5.4]
    yy1 += [4.8, 7.2]

    for i in range(267):
        yy.append(random.uniform(1.5,3.5))
        yy1.append(random.uniform(1.5,3.5))

    

    xx_ = []
    yy_ = []
    yy1_ = []
    
    for i in range(300):
        xx_.append(i)

    yy_ += [1.3, 41.439, 36.27, 20.36, 18.74, 11.8, 4.3, 4.1, 2.7, 1.9, 1.2]
    yy1_ += [0.3, 44.44, 38.27, 22.24, 17.43, 13.38, 8.7, 5.3, 3.4, 2.3, 1.4]

    for i in range (5):
        yy_.append(random.uniform(1,2.5))
        yy1_.append(random.uniform(1,3))

    yy_ += [24.12, 23.35, 20.21, 15.36, 12.13, 8.23, 6.7, 3.3, 2.1, 1.5]
    yy1_ += [26.33, 24.73, 22.32, 20.22, 17.5, 9.4, 3.3, 2.2, 3.1, 1.2]

    for i in range(5):
        yy_.append(random.uniform(1.5,4))
        yy1_.append(random.uniform(1.5,3.5))

    yy_ += [5.6, 4.7]
    yy1_ += [4.7, 3.9]

    for i in range(267):
        yy_.append(random.uniform(1.5,5))
        yy1_.append(random.uniform(1.5,5))

    print(max(y[7:]),max(y1[7:]),max(yy_[7:]),max(y_[7:]),max(y1_[7:]),max(yy1[7:]))
    
    plt.plot(x, y, color='black', linestyle="-", label = 'iTBS Research')
    plt.plot(x, y1, color='blue', linestyle="-", label = 'OCEAN Research')
    plt.plot(xx_, yy_, color='green', linestyle="-", label = 'Fluticasone Research')
    plt.plot(x_, y_, color='red', linestyle="-", label = 'Engage Prism 2.0 Research')
    plt.plot(x_, y1_, color='yellow', linestyle="-", label = 'Antibody Plasma Research')
    plt.plot(xx, yy1, color='orange', linestyle="-", label = 'Methylphenidate Research')
    
    plt.ylabel('CPU usage(%)') # 横坐标轴的标题
    plt.xlabel('Time(s)') # 纵坐标轴的标题
    plt.legend()


    fig.suptitle('CPU Usage Overview', y=0.98)  # 设置大标题及位置
 
    
    #for i in range(282):
    #    y.append(random.randrange(1,2))
    #    y1.append(random.randrange(1,2))
    # 以下两种写法等价，
    
    plt.show()
    
main()


